package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGLevelType.*;
import org.sorapointa.proto.GCGLevelType;

public class GCGStartChallengeRsp {
    @Tag(tag=12) public Integer levelType = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer configId = null;
    @Tag(tag=1) public Integer levelId = null;
}
