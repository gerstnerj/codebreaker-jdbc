package us.nm.state.hsd.codebreaker.model.entity;

import java.util.Date;
import java.util.UUID;

/*
 * Joshua Gerstner
 */

public class Guess {

//Fields
  private UUID id;
  private Date created;
  private UUID codeId;
  private String text;
  private int exactMatches;
  private int nearMatches;
  
//Getters and setters
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
  protected UUID getCodeId() {
    return codeId;
  }
  protected void setCodeId(UUID codeId) {
    this.codeId = codeId;
  }
  protected String getText() {
    return text;
  }
  protected void setText(String text) {
    this.text = text;
  }
  protected int getExactMatches() {
    return exactMatches;
  }
  protected void setExactMatches(int exactMatches) {
    this.exactMatches = exactMatches;
  }
  protected int getNearMatches() {
    return nearMatches;
  }
  protected void setNearMatches(int nearMatches) {
    this.nearMatches = nearMatches;
  }
  
//Other methods...
  
  
}
