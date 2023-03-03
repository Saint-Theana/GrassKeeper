package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InterOpType.*;
import org.sorapointa.proto.InterOpType;
import org.sorapointa.proto.ResinCostType.*;
import org.sorapointa.proto.ResinCostType;

public class GadgetInteractReq {
    @Tag(tag=8) public Integer gadgetId = null;
    @Tag(tag=15) public Boolean isUseCondenseResin = null;
    @Tag(tag=5) public Integer opType = null;
    @Tag(tag=1) public Integer resinCostType = null;
    @Tag(tag=2) public Integer uiInteractId = null;
    @Tag(tag=4) public Integer gadgetEntityId = null;
}
