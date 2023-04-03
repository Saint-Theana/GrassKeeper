package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InfernceWordInfo.*;
import org.sorapointa.proto.InfernceWordInfo;

public class InferencePageInfo {
    @Tag(tag=6) public Integer pageId = null;
    @Tag(tag=8) public List<InfernceWordInfo> unlockWordList = new ArrayList<>();
}
