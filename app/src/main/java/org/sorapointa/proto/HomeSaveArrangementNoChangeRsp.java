package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeSaveArrangementNoChangeRsp {
    @Tag(tag=4) public Integer sceneId = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
}
