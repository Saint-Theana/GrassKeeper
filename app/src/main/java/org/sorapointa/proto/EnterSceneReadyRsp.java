package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterSceneReadyRsp {
    @Tag(tag=1) public Integer enterSceneToken = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
