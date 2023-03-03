package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlessingAcceptGivePicRsp {
    @Tag(tag=1) public Integer picId = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public Integer index = null;
    @Tag(tag=14) public Integer uid = null;
}
