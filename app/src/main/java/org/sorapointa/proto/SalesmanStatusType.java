package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum SalesmanStatusType {
        @Tag(tag=0) SALESMAN_STATUS_TYPE_NONE ,
        @Tag(tag=1) SALESMAN_STATUS_TYPE_UNSTARTED ,
        @Tag(tag=2) SALESMAN_STATUS_TYPE_STARTED ,
        @Tag(tag=3) SALESMAN_STATUS_TYPE_DELIVERED ;
}
