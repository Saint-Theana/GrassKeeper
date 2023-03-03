package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneAudioNotify {
    @Tag(tag=14,isFloat=true) public List<Float> param2 = new ArrayList<>();
    @Tag(tag=3,isSigned=true) public Integer type = null;
    @Tag(tag=11) public List<String> param3 = new ArrayList<>();
    @Tag(tag=6) public Integer sourceUid = null;
    @Tag(tag=4) public List<Integer> param1 = new ArrayList<>();
}
