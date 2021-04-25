package controllers;


import models.Delivery;
import connector.Connector;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DeliveryController{

	Connector con = Connector.getInstance();

	private DeliveryController(){
	}

	private static final DeliveryController obj = new DeliveryController();

	public static DeliveryController getInstance(){
		return obj;
	}

	public void Save(Delivery data) throws Exception {
		con.getConnection();
		con.aud("INSERT INTO delivery(location,delivery_time,description) values ('" + data.getLocation()+ "','" + data.getDelivery_time()+ "','" + data.getDescription()+ "') " );
	}

	public void Update(Delivery data) throws Exception {
		con.getConnection();
		con.aud("UPDATE delivery SET location  = '" + data.getLocation()+ "',delivery_time  = '" + data.getDelivery_time()+ "',description  = '" + data.getDescription()+ "' WHERE id = '" + data.getId()+ "'");
	}

	public void Delete(Delivery data) throws Exception {
		con.getConnection();
		con.aud("DELETE FROM delivery WHERE id = '" + data.getId()+ "'");
	}

	public List<Delivery> SearchAll() throws Exception {
		List<Delivery> objList = new ArrayList<Delivery>();
		con.getConnection();
		ResultSet rset = con.srh("SELECT * FROM delivery");
		while(rset.next()){
			Delivery obj = new Delivery();
			obj.setId(rset.getInt(1));
			obj.setLocation(rset.getString(2));
			obj.setDelivery_time(rset.getString(3));
			obj.setDescription(rset.getString(4));
			objList.add(obj);
		}

	return objList;
	}

	public List<Delivery> Search(Delivery data) throws Exception {
		List<Delivery> objList = new ArrayList<Delivery>();
		con.getConnection();
		ResultSet rset = con.srh("SELECT * FROM delivery WHERE id = '" + data.getId()+ "'");
		while(rset.next()){
			Delivery obj = new Delivery();
			obj.setId(rset.getInt(1));
			obj.setLocation(rset.getString(2));
			obj.setDelivery_time(rset.getString(3));
			obj.setDescription(rset.getString(4));
			objList.add(obj);
		}

	return objList;
	}

}