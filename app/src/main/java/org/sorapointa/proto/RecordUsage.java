package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum RecordUsage {
        @Tag(tag=0) RECORD_USAGE_UGC_RECORD_USAGE_NONE ,
        @Tag(tag=1) RECORD_USAGE_UGC_RECORD_USAGE_IMPORT ,
        @Tag(tag=2) RECORD_USAGE_UGC_RECORD_USAGE_PLAY ,
        @Tag(tag=3) RECORD_USAGE_UGC_RECORD_USAGE_TRIAL ,
        @Tag(tag=4) RECORD_USAGE_UGC_RECORD_USAGE_COMPARE ;
}
