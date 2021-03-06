package com.hitdavid.service.dao.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by David on 2017/5/30.
 */

@Entity
@Table(name = "Resource")
public class Resource  implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Integer type;

    private Integer status;

    private String title;

    private String url;

    private String description;

    private Long fatherId;

    public Resource() {

    }

    @Override
    public String toString() {
        return String.format(
            "Resource[id=%d, title='%s', url='%s']",
            id, title, url);
    }

    public Long getId() {
        return id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getFatherId() {
        return fatherId;
    }

    public void setFatherId(Long fatherId) {
        this.fatherId = fatherId;
    }
}
