package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InferenceWordInfo {
    @Tag(tag=8) public Integer wordId = null;
    @Tag(tag=15) public Boolean isInterpret = null;
    @Tag(tag=10) public Boolean isSubmit = null;
    @Tag(tag=6) public Boolean isAssociate = null;
    @Tag(tag=5) public Integer unlockByWordId = null;
}
