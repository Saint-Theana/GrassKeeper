package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PushTipsReadFinishRsp {
    @Tag(tag=3) public Integer pushTipsId = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}
