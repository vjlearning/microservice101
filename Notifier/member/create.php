<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// required headers
header("Access-Control-Allow-Origin: *");
header("Content-Type: application/json; charset=UTF-8");
header("Access-Control-Allow-Methods: POST");
header("Access-Control-Max-Age: 3600");
header("Access-Control-Allow-Headers: Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With");

// include database and object files
include_once '../conf/db_utils.php';
include_once '../vo/member_info.php';

// instantiate database and member object
$database = new DBUtil();
$db_conn = $database->getDBConnection();

//instantiate member 
$member = new MemberInfo($db_conn);

// get posted data
$data = json_decode(file_get_contents("php://input"));

$member->name = $data->member_name;
$member->dob = $data->member_dob;
$member->mobile = $data->member_mobile;
$member->email = $data->member_email;
$member->address = $data->member_address;
$member->gender = $data->member_gender;
$member->member_since = date('Y-m-d H:i:s');
$member->parent_id = $data->member_parent_id;
$member->level = $data->member_level;
$member->created_date = date('Y-m-d H:i:s');
$member->created_by = "Vijendra";


try {

    if ($member->create_member()) {
        echo json_encode(
                array("message" => "Member Registred")
        );
    } else {
        http_response_code(500);
        echo json_encode(
                array("message" => "Sorry! Member Registraction Failed")
        );
    }
} catch (Exception $ex) {
    http_response_code(500);
        echo json_encode(
                array("message" => $ex->getTraceAsString())
        );
}
?>