<?php

/*
 * Copyright 2018 by vjlearning
 */

/**
 * Author:  Vijendra Rao 
 * Created: Aug 03, 2018
 */
class NotificationInfo {

  // object properties
    public $from_addr;
    public $to_addr;
    public $cc_addr;
    public $bcc_addr;
    public $subject;
    public $content;
    public $content_type;
    
    public $host;
    public $username;
    public $password;


    // constructor with $database as database connection
    public function __construct($host, $username, $password) {
        $this->host = $host;
        $this->username = $username;
        $this->password = $password;
    }

    // create product
    function send_email() {
       
        
        PEAR::setErrorHandling(PEAR_ERROR_PRINT);
        /* MIME-Version should be "1.0rn" and Content-Type should be "text/html; charset=ISO-8859-1rn" to send an HTML Email */
        $headers = array('MIME-Version' => '1.0rn',
            'Content-Type' => "text/html; charset=ISO-8859-1rn",
            'From' => $this->from_addr,
            'To' => $this->to_addr,
            'Subject' => $this->subject
        );
       
        
        $smtp = Mail::factory('smtp', array('host' => $this->host, 
                    'port' => '465',
                    //'debug'=>true,
                    'auth' => true,
                    'socket_options' =>array('ssl' => array('verify_peer_name' => false)),
                    'username' => $this->username,
                    'password' => base64_decode($this->password) ));
        
        $mail = $smtp->send($this->to_addr, $headers, base64_decode($this->content));
        if (PEAR::isError($mail)) {
            throw new Exception($mail);
        } else {
            return true;
        }

        return false;
    }

}

?>
