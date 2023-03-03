package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PSPlayerApplyEnterMpRsp {
    @Tag(tag=2) public String targetPsnId = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Integer param = null;
}
