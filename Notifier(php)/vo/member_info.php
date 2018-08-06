<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// database connection and table name

class MemberInfo {

    private $conn;
    private $table_name = "member_info";
    
    // object properties
    public $id;
    public $name;
    public $dob;
    public $mobile;
    public $email;
    public $address;
    public $gender;
    public $member_since;
    public $parent_id;
    public $level;
    public $created_date;
    public $created_by;
    public $updated_date;
    public $updated_by;
    public $active_flag;

    // constructor with $database as database connection
    public function __construct($database_conn) {
        $this->conn = $database_conn;
    }

    // read products
    function list_members() {

        // select all query
        $query = "SELECT member_id, member_name, member_dob, member_email, member_mobile, member_gender, member_address, member_since, member_parent_id, member_level, rec_created_date, rec_created_by, rec_updated_date, rec_updated_by, active_flag FROM " . $this->table_name;

        // prepare query statement
        $stmt = $this->conn->prepare($query);

        // execute query
        $stmt->execute();

        return $stmt;
    }

    // create product
    function create_member() {
        $this->conn->setAttribute( PDO::ATTR_ERRMODE, PDO::ERRMODE_WARNING );
        // query to insert record
        $query = "INSERT INTO " . $this->table_name . " SET "
                . "member_name=:member_name, "
                . "member_dob=:member_dob, "
                . "member_email=:member_email, "
                . "member_mobile=:member_mobile, "
                . "member_gender=:member_gender, "
                . "member_address=:member_address, "
                . "member_since=:member_since, "
                . "member_parent_id=:member_parent_id, "
                . "member_level=:member_level, "
                . "rec_created_date=:rec_created_date, "
                . "rec_created_by=:rec_created_by";
        

        // prepare query
        $stmt = $this->conn->prepare($query);

        // sanitize
        $this->name = htmlspecialchars(strip_tags($this->name));
        $this->dob = htmlspecialchars(strip_tags($this->dob));
        $this->email = htmlspecialchars(strip_tags($this->email));
        $this->mobile = htmlspecialchars(strip_tags($this->mobile));
        $this->gender = htmlspecialchars(strip_tags($this->gender));
        $this->address = htmlspecialchars(strip_tags($this->address));
        $this->memeber_since = htmlspecialchars(strip_tags($this->member_since));
        $this->parent_id = htmlspecialchars(strip_tags($this->parent_id));
        $this->level = htmlspecialchars(strip_tags($this->level));
        $this->created_date = htmlspecialchars(strip_tags($this->created_date));
        $this->created_by = htmlspecialchars(strip_tags($this->created_by));

        // bind values
       
        $stmt->bindParam(":member_name", $this->name);
        $stmt->bindParam(":member_dob", $this->dob);
        $stmt->bindParam(":member_mobile", $this->mobile);
        $stmt->bindParam(":member_email", $this->email);
        $stmt->bindParam(":member_address", $this->addresss);
        $stmt->bindParam(":member_gender", $this->gender);
        $stmt->bindParam(":member_since", $this->member_since);
        $stmt->bindParam(":member_parent_id", $this->parent_id);
        $stmt->bindParam(":member_level", $this->level);
        $stmt->bindParam(":rec_created_date", $this->created_date);
        $stmt->bindParam(":rec_created_by", $this->created_by);
            
       try{
           if ($stmt->execute()) {
            return true;
        }
           
       } catch (Exception $ex) {
           throw new Exception($ex);
       }
        // execute query
        
        return false;
    }
}

?>
