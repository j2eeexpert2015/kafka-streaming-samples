package org.kstreamsamples.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"name",
"department",
"salary",
"createdtime"
})
public class Employee {

@JsonProperty("id")
private String id;
@JsonProperty("name")
private String name;
@JsonProperty("department")
private String department;
@JsonProperty("salary")
private Integer salary;
@JsonProperty("createdtime")
private String createdtime;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("id")
public String getId() {
return id;
}

@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("department")
public String getDepartment() {
return department;
}

@JsonProperty("department")
public void setDepartment(String department) {
this.department = department;
}

@JsonProperty("salary")
public Integer getSalary() {
return salary;
}

@JsonProperty("salary")
public void setSalary(Integer salary) {
this.salary = salary;
}

@JsonProperty("createdtime")
public String getCreatedtime() {
return createdtime;
}

@JsonProperty("createdtime")
public void setCreatedtime(String createdtime) {
this.createdtime = createdtime;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
