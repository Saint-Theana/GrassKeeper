package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InferenceWordInfo.*;
import org.sorapointa.proto.InferenceWordInfo;

public class InferencePageInfo {
    @Tag(tag=3) public Integer pageId = null;
    @Tag(tag=15) public List<InferenceWordInfo> unlockWordList = new ArrayList<>();
}
