package us.nm.state.hsd.codebreaker.model.entity;

import java.util.Date;
import java.util.UUID;

/*
 * Joshua Gerstner
 */

public class Code {

//Fields
  private UUID id;
  private Date created;
  private int length;
  private String pool;
  private String text;
  
//Getters and Setters
  protected UUID getId() {
    return id;
  }
  protected void setId(UUID id) {
    this.id = id;
  }
  protected Date getCreated() {
    return created;
  }
  protected void setCreated(Date created) {
    this.created = created;
  }
  protected int getLength() {
    return length;
  }
  protected void setLength(int length) {
    this.length = length;
  }
  protected String getPool() {
    return pool;
  }
  protected void setPool(String pool) {
    this.pool = pool;
  }
  protected String getText() {
    return text;
  }
  protected void setText(String text) {
    this.text = text;
  }
  
//Other class methods...
  
  
}
