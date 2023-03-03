package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGClientSettleRsp {
    @Tag(tag=4) public Integer closeTime = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
