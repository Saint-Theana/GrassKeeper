package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DetectorData.*;
import org.sorapointa.proto.DetectorData;
import org.sorapointa.proto.ClientCollectorData.*;
import org.sorapointa.proto.ClientCollectorData;
import org.sorapointa.proto.SkyCrystalDetectorQuickUseResult.*;
import org.sorapointa.proto.SkyCrystalDetectorQuickUseResult;

public class QuickUseWidgetRsp {
    public enum QuickUseWidgetRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4252) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer materialId = null;
    @Tag(tag=1) public DetectorData detectorData = null;
    @Tag(tag=7) public ClientCollectorData clientCollectorData = null;
    @Tag(tag=139827) public SkyCrystalDetectorQuickUseResult skyCrystalDetectorQuickUseResult = null;
}
