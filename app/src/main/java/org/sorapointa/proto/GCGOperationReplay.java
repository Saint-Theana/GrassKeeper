package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGReplayControllerData.*;
import org.sorapointa.proto.GCGReplayControllerData;
import org.sorapointa.proto.GCGReplayOperationData.*;
import org.sorapointa.proto.GCGReplayOperationData;
import org.sorapointa.proto.NJAPCNDDMBH.*;
import org.sorapointa.proto.NJAPCNDDMBH;

public class GCGOperationReplay {
    @Tag(tag=9) public List<GCGReplayControllerData> controllerDataList = new ArrayList<>();
    @Tag(tag=8) public Integer gameId = null;
    @Tag(tag=6) public List<GCGReplayOperationData> operationDataList = new ArrayList<>();
    @Tag(tag=12) public Integer seed = null;
    @Tag(tag=3) public List<NJAPCNDDMBH> cpmjjejogbm = new ArrayList<>();
}
