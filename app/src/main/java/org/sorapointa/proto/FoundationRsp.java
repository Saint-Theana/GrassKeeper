package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FoundationOpType.*;
import org.sorapointa.proto.FoundationOpType;

public class FoundationRsp {
    @Tag(tag=13) public Integer opType = null;
    @Tag(tag=10) public Integer gadgetEntityId = null;
    @Tag(tag=11) public Integer buildingId = null;
    @Tag(tag=12) public Integer pointConfigId = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
