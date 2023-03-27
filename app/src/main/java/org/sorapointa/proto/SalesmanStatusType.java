package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum SalesmanStatusType {
        @Tag(tag=0) SalesmanStatusNone ,
        @Tag(tag=1) SalesmanStatusUnstarted ,
        @Tag(tag=2) SalesmanStatusStarted ,
        @Tag(tag=3) SalesmanStatusDelivered ;
}
