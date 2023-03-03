package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AnchorPointData.*;
import org.sorapointa.proto.AnchorPointData;
import org.sorapointa.proto.ClientCollectorData.*;
import org.sorapointa.proto.ClientCollectorData;
import org.sorapointa.proto.LunchBoxData.*;
import org.sorapointa.proto.LunchBoxData;
import org.sorapointa.proto.OneofGatherPointDetectorData.*;
import org.sorapointa.proto.OneofGatherPointDetectorData;
import org.sorapointa.proto.SkyCrystalDetectorData.*;
import org.sorapointa.proto.SkyCrystalDetectorData;
import org.sorapointa.proto.WidgetCoolDownData.*;
import org.sorapointa.proto.WidgetCoolDownData;
import org.sorapointa.proto.WidgetSlotData.*;
import org.sorapointa.proto.WidgetSlotData;

public class AllWidgetDataNotify {
    @Tag(tag=11) public List<Integer> backgroundActiveWidgetList = new ArrayList<>();
    @Tag(tag=1) public LunchBoxData lunchBoxData = null;
    @Tag(tag=13) public List<WidgetCoolDownData> coolDownGroupDataList = new ArrayList<>();
    @Tag(tag=3) public List<AnchorPointData> anchorPointList = new ArrayList<>();
    @Tag(tag=6) public List<WidgetSlotData> slotList = new ArrayList<>();
    @Tag(tag=10) public Integer nextAnchorPointUsableTime = null;
    @Tag(tag=4) public List<ClientCollectorData> clientCollectorDataList = new ArrayList<>();
    @Tag(tag=15) public List<OneofGatherPointDetectorData> oneofGatherPointDetectorDataList = new ArrayList<>();
    @Tag(tag=9) public List<WidgetCoolDownData> normalCoolDownDataList = new ArrayList<>();
    @Tag(tag=12) public SkyCrystalDetectorData skyCrystalDetectorData = null;
}
