package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ReportReasonType {
        @Tag(tag=0) ReportReasonNone ,
        @Tag(tag=1) ReportReasonDeceptiveAds ,
        @Tag(tag=2) ReportReasonAbusing ,
        @Tag(tag=3) ReportReasonCheat ,
        @Tag(tag=4) ReportReasonPolitical ,
        @Tag(tag=5) ReportReasonOther ,
        @Tag(tag=6) ReportReasonHome ;
}
