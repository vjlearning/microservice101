<?php
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// required headers
header("Access-Control-Allow-Origin: *");
header("Content-Type: application/json; charset=UTF-8");

// include database and object files
include_once '../conf/db_utils.php';
include_once '../vo/member_info.php';

// instantiate database and member object
$database = new DBUtil();
$db_conn = $database->getDBConnection();

//instantiate member 
$member = new MemberInfo($db_conn);

$stmt = $member->list_members();
$record_count = $stmt->rowCount();

if ($record_count > 0) {

    //$member_arr = array();
    $member_arr["members"] = array();

    while ($row = $stmt->fetch(PDO::FETCH_ASSOC)) {
        // extract row
        // this will make $row['name'] to
        // just $name only
        extract($row);

          $member = array(
            "member_id" => $member_id,
            "member_name" => $member_name,
            "member_dob" => $member_dob,
            "member_mobile" => $member_mobile,
            "member_email" => $member_email,
            "member_address" => $member_address,
            "memeber_gender" => $member_gender,
            "member_since" => $member_since,
            "member_parent_id" => $member_parent_id,
            "member_level" => $member_level,
            "created_date" => $rec_created_date,
            "created_by" => $rec_created_by,
            "updated_date" => $rec_updated_date,
            "updated_by" => $rec_updated_by,
            "active_flag" => $active_flag
        );
        array_push($member_arr["members"], $member);
    }
    echo json_encode($member_arr);
} else {
    http_response_code(404);
    echo json_encode(
            array("message" => "No products found.")
    );
}
?>
