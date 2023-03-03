package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGLevelType.*;
import org.sorapointa.proto.GCGLevelType;

public class GCGStartChallengeReq {
    @Tag(tag=5) public Integer levelType = null;
    @Tag(tag=13) public Integer configId = null;
    @Tag(tag=12) public Integer levelId = null;
}
