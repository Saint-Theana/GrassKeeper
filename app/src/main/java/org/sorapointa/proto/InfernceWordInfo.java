package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InfernceWordInfo {
    @Tag(tag=3) public Boolean isAssociate = null;
    @Tag(tag=5) public Integer wordId = null;
    @Tag(tag=13) public Integer unlockByWordId = null;
    @Tag(tag=4) public Boolean isSubmit = null;
    @Tag(tag=7) public Boolean isInterpret = null;
}
