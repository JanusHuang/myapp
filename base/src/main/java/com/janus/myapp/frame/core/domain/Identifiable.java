package com.janus.myapp.frame.core.domain;

import java.io.Serializable;

public interface Identifiable extends Serializable {

    String getId();

    void setId(String id);
}
