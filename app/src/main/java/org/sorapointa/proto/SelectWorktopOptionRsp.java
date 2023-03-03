package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SelectWorktopOptionRsp {
    @Tag(tag=13) public Integer gadgetEntityId = null;
    @Tag(tag=7) public Integer optionId = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
