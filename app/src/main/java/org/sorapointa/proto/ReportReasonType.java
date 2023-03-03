package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ReportReasonType {
        @Tag(tag=0) REPORT_REASON_TYPE_NONE ,
        @Tag(tag=1) REPORT_REASON_TYPE_DECEPTIVE_ADS ,
        @Tag(tag=2) REPORT_REASON_TYPE_ABUSING ,
        @Tag(tag=3) REPORT_REASON_TYPE_CHEAT ,
        @Tag(tag=4) REPORT_REASON_TYPE_POLITICAL ,
        @Tag(tag=5) REPORT_REASON_TYPE_OTHER ,
        @Tag(tag=6) REPORT_REASON_TYPE_HOME ;
}
