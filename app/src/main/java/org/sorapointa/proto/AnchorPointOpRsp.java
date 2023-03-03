package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AnchorPointOpRsp {
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public Integer anchorPointId = null;
    @Tag(tag=4) public Integer anchorPointOpType = null;
}
