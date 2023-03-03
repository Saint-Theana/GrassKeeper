package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PingRsp {
    @Tag(tag=15) public Integer clientTime = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Integer seq = null;
}
