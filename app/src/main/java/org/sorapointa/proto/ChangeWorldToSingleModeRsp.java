package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChangeWorldToSingleModeRsp {
    @Tag(tag=15) public Integer quitMpValidTime = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
