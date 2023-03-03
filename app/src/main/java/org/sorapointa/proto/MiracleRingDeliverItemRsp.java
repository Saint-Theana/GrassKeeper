package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InterOpType.*;
import org.sorapointa.proto.InterOpType;
import org.sorapointa.proto.InteractType.*;
import org.sorapointa.proto.InteractType;

public class MiracleRingDeliverItemRsp {
    @Tag(tag=15) public Integer interactType = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer opType = null;
    @Tag(tag=4) public Integer gadgetId = null;
    @Tag(tag=9) public Integer gadgetEntityId = null;
}
