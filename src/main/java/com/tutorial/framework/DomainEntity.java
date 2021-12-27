package com.tutorial.framework;

import java.io.Serializable;

public interface DomainEntity<PKType> extends Serializable {

    PKType identity();
}
