<?php

/* 
 * Copyright 2018 by vjlearning
 */
/**
 * Author:  Vijendra Rao 
 * Created: Aug 03, 2018
 */

// required headers
header("Access-Control-Allow-Origin: *");
header("Content-Type: application/json; charset=UTF-8");
header("Access-Control-Allow-Methods: POST");
header("Access-Control-Max-Age: 3600");
header("Access-Control-Allow-Headers: Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With");

 ini_set('display_errors','on');
   error_reporting(E_ALL);

// include database and object files
require_once "Mail.php";
include_once '../vo/notification_info.php';

$headers=array();
foreach (getallheaders() as $name => $value) {
    $headers[$name] = $value;
}


//instantiate member 
$notification = new NotificationInfo($headers["smtphost"], $headers["username"], $headers["password"]);
//$notification = new NotificationInfo("ssl://smtp.gmail.com", "info.vjlearning@gmail.com", "QWNoYXJrNTEk");

// get posted data
$data = json_decode(file_get_contents("php://input"));

$notification->from_addr = $data->from_addr;
$notification->subject = $data->subject;
$notification->content = $data->content;
$notification->to_addr = $data->to_addr;

try {

    if ($notification->send_email()) {
        echo json_encode(
                array("message" => "Notification Sent Successfully!")
        );
    } else {
        http_response_code(500);
        echo json_encode(
                array("message" => "Sorry! Sending Notification Failed")
        );
    }
} catch (Exception $ex) {
    http_response_code(500);
        echo json_encode(
                array("message" => $ex->getTraceAsString())
        );
}
?>