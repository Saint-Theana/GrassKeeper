package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneEntityDrownRsp {
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Integer entityId = null;
}
