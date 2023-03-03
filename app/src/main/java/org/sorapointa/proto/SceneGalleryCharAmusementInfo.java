package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneGalleryCharAmusementInfo {
    @Tag(tag=2) public Boolean isLastLevel = null;
    @Tag(tag=9) public Integer maxScore = null;
    @Tag(tag=14) public Integer curScore = null;
    @Tag(tag=10) public Boolean isFinish = null;
    @Tag(tag=1) public Boolean isSuccess = null;
}
