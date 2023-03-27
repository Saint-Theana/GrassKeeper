package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGLimitsInfo {
    @Tag(tag=15) public Integer limitType = null;
    @Tag(tag=3) public Integer limitValue = null;
}
