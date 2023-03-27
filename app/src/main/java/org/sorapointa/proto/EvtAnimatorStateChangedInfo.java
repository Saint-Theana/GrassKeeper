package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtAnimatorStateChangedInfo {
    @Tag(tag=9) public Integer normalizedTimeCompact = null;
    @Tag(tag=8,isFloat=true) public Float fadeDuration = null;
    @Tag(tag=11) public Integer entityId = null;
    @Tag(tag=13) public Boolean forceSync = null;
    @Tag(tag=12) public Boolean handleAnimatorStateImmediately = null;
    @Tag(tag=3,isSigned=true) public Integer faceAngleCompact = null;
    @Tag(tag=4) public Integer toStateHash = null;
    @Tag(tag=5) public Integer layer = null;
    @Tag(tag=7) public Vector pos = null;
}
