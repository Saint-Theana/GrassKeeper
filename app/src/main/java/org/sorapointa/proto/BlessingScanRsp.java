package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlessingScanRsp {
    @Tag(tag=4) public Integer scanPicId = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public Integer curDayScanNum = null;
}
