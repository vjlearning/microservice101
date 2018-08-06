<?php
//error_reporting(E_ALL ^ E_WARNING); 
date_default_timezone_set('Asia/Kolkata');



/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class DBUtil{
 
    // specify your own database credentials
    private $host = "localhost";
    private $db_name = "belasi";
    private $username = "root";
    private $password = "root";
    public $conn;
 
    // get the database connection
    public function getDBConnection(){
 
        $this->conn = null;
 
        try{
            $this->conn = new PDO("mysql:host=" . $this->host . ";dbname=" . $this->db_name, $this->username, $this->password);
            $this->conn->exec("set names utf8");
        }catch(PDOException $exception){
            echo "Connection error: " . $exception->getMessage();
        }
 
        return $this->conn;
    }
}
?>