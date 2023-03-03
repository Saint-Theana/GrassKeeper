package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterSceneDoneRsp {
    @Tag(tag=15) public Integer enterSceneToken = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
