package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum RecordUsage {
        @Tag(tag=0) UgcRecordUsageNone ,
        @Tag(tag=1) UgcRecordUsageImport ,
        @Tag(tag=2) UgcRecordUsagePlay ,
        @Tag(tag=3) UgcRecordUsageTrial ,
        @Tag(tag=4) UgcRecordUsageCompare ;
}
