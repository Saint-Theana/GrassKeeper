package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtAnimatorStateChangedInfo {
    @Tag(tag=14,isSigned=true) public Integer faceAngleCompact = null;
    @Tag(tag=5) public Integer toStateHash = null;
    @Tag(tag=9) public Integer normalizedTimeCompact = null;
    @Tag(tag=2) public Integer layer = null;
    @Tag(tag=13) public Vector pos = null;
    @Tag(tag=3,isFloat=true) public Float fadeDuration = null;
    @Tag(tag=1) public Boolean forceSync = null;
    @Tag(tag=15) public Integer entityId = null;
    @Tag(tag=7) public Boolean handleAnimatorStateImmediately = null;
}
