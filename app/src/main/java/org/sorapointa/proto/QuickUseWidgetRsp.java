package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ClientCollectorData.*;
import org.sorapointa.proto.ClientCollectorData;
import org.sorapointa.proto.OneofGatherPointDetectorData.*;
import org.sorapointa.proto.OneofGatherPointDetectorData;
import org.sorapointa.proto.SkyCrystalDetectorQuickUseResult.*;
import org.sorapointa.proto.SkyCrystalDetectorQuickUseResult;

public class QuickUseWidgetRsp {
    @Tag(tag=6) public Integer materialId = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public OneofGatherPointDetectorData detectorData = null;
    @Tag(tag=15) public ClientCollectorData clientCollectorData = null;
    @Tag(tag=168922) public SkyCrystalDetectorQuickUseResult skyCrystalDetectorQuickUseResult = null;
}
