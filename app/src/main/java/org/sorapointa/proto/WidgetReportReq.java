package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WidgetReportReq {
    public enum WidgetReportReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4287) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Boolean isClearHint = null;
    @Tag(tag=9) public Boolean isClearSkyCrystalHint = null;
    @Tag(tag=12) public Integer weatherWizardShieldValue = null;
    @Tag(tag=5) public Integer materialId = null;
    @Tag(tag=7) public Boolean isClientCollect = null;
}
