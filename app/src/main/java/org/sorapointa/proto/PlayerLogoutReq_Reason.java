package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum PlayerLogoutReq_Reason {
        @Tag(tag=0) Disconnect ,
        @Tag(tag=1) ClientReq ,
        @Tag(tag=2) Timeout ,
        @Tag(tag=3) AdminReq ,
        @Tag(tag=4) ServerClose ,
        @Tag(tag=5) GmClear ,
        @Tag(tag=6) PlayerTransfer ,
        @Tag(tag=7) ClientChecksumInvalid ,
        @Tag(tag=8) NHMKGJGLHPO ;
}
