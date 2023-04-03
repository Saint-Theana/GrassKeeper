package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SkyCrystalDetectorData.*;
import org.sorapointa.proto.SkyCrystalDetectorData;
import org.sorapointa.proto.WeatherWizardData.*;
import org.sorapointa.proto.WeatherWizardData;
import org.sorapointa.proto.LunchBoxData.*;
import org.sorapointa.proto.LunchBoxData;
import org.sorapointa.proto.WidgetCoolDownData.*;
import org.sorapointa.proto.WidgetCoolDownData;
import org.sorapointa.proto.WidgetSlotData.*;
import org.sorapointa.proto.WidgetSlotData;
import org.sorapointa.proto.AnchorPointData.*;
import org.sorapointa.proto.AnchorPointData;
import org.sorapointa.proto.ClientCollectorData.*;
import org.sorapointa.proto.ClientCollectorData;
import org.sorapointa.proto.DetectorData.*;
import org.sorapointa.proto.DetectorData;

public class AllWidgetDataNotify {
    public enum AllWidgetDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4286) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public SkyCrystalDetectorData skyCrystalDetectorData = null;
    @Tag(tag=4) public List<WidgetCoolDownData> normalCoolDownDataList = new ArrayList<>();
    @Tag(tag=14) public List<WidgetSlotData> slotList = new ArrayList<>();
    @Tag(tag=5) public List<Integer> backgroundActiveWidgetList = new ArrayList<>();
    @Tag(tag=11) public List<AnchorPointData> anchorPointList = new ArrayList<>();
    @Tag(tag=13) public WeatherWizardData weatherWizardData = null;
    @Tag(tag=15) public Integer nextAnchorPointUsableTime = null;
    @Tag(tag=7) public List<ClientCollectorData> clientCollectorDataList = new ArrayList<>();
    @Tag(tag=6) public List<WidgetCoolDownData> coolDownGroupDataList = new ArrayList<>();
    @Tag(tag=8) public List<DetectorData> oneoffGatherPointDetectorDataList = new ArrayList<>();
    @Tag(tag=1) public LunchBoxData lunchBoxData = null;
}
