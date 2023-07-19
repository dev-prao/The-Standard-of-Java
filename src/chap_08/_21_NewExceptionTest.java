package chap_08;

public class _21_NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException se) {
            System.out.println("에러 메세지: " + se.getMessage());
            se.printStackTrace();
            System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
        } catch (MemoryException me) {
            System.out.println("에러 메세지: " + me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("다시 설치를 시도하세요.");
        } finally {
            deleteTempFiles();
        }
    }

    private static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) throw new SpaceException("설치할 공간이 부족합니다.");
        if (!enoughMemory()) throw new MemoryException("메모리가 부족합니다.");
    }

    private static void copyFiles() {
    }

    private static void deleteTempFiles() {
    }

    private static boolean enoughSpace() {
        return false;
    }

    private static boolean enoughMemory() {
        return true;
    }

    private static class SpaceException extends Exception {
        SpaceException(String msg) {
            super(msg);
        }
    }

    private static class MemoryException extends Exception {
        MemoryException(String msg) {
            super(msg);
        }
    }
}
