package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGCostReviseInfo.*;
import org.sorapointa.proto.GCGCostReviseInfo;

public class GCGMsgCostRevise {
    @Tag(tag=5) public Integer controllerId = null;
    @Tag(tag=13) public GCGCostReviseInfo costRevise = null;
}
