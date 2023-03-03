package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InterOpType.*;
import org.sorapointa.proto.InterOpType;
import org.sorapointa.proto.InteractType.*;
import org.sorapointa.proto.InteractType;

public class GadgetInteractRsp {
    @Tag(tag=10) public Integer gadgetEntityId = null;
    @Tag(tag=2) public Integer interactType = null;
    @Tag(tag=3) public Integer opType = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public Integer gadgetId = null;
}
